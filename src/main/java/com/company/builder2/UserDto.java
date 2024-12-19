package com.company.builder2;

import com.company.builder.Address;
import com.company.builder.UserDtoBuilder;

import java.time.LocalDate;
import java.time.Period;

public class UserDto {
    private String name;

    private String address;

    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
    //Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }
    //Builder
    public static class UserDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDto userDto;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " " +address.getStreet()
                    + "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode();

            return this;
        }

        public UserDto build() {
            this.userDto = new UserDto();
            userDto.setName(firstName+" " + lastName);
            userDto.setAddress(address);
            userDto.setAge(age);
            return this.userDto;
        }

        public UserDto getUserDTO() {
            return this.userDto;
        }
    }
}
