package com.company.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        Report report1 = new Report("Cashflow report", "ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report1);

        System.out.println(exp);

        User user1 = new User("Dave", "USER", "ADMIN");
        System.out.println("User1 access report:" + exp.interpret(user1));

        User user2 = new User("Dave", "USER");
        System.out.println("User2 access report:" + exp.interpret(user2));
    }
}
