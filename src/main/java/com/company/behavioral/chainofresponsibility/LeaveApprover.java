package com.company.behavioral.chainofresponsibility;

public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
