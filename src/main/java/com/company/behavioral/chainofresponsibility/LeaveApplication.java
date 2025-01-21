package com.company.behavioral.chainofresponsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LeaveApplication {
    public enum Type {Sick, PTO, LOP};
    public enum Status {Pending, Approved, Rejected};
    private Type type;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }

    public Long getNoOfDays() {
        return ChronoUnit.DAYS.between(from, to);
    }

    public void approve(String approverName) {
        System.out.println(approverName + " approved");
        this.status = Status.Approved;
        this.processedBy = approverName;
    }

    public void reject(String approverName) {
        this.status = Status.Rejected;
        this.processedBy = approverName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder{
        private Type type;
        private LocalDate from;
        private LocalDate to;
        private LeaveApplication application;

        private Builder() {

        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder from(LocalDate from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalDate to) {
            this.to = to;
            return this;
        }

        public LeaveApplication build() {
            this.application = new LeaveApplication(type, from, to);
            return this.application;
        }

        public LeaveApplication getApplication() {
            return application;
        }
    }

    @Override
    public String toString() {
        return type + " leave for "+getNoOfDays()+" day(s) "+status
                + " by "+processedBy;
    }
}
