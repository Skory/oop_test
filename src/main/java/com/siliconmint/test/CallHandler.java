package com.siliconmint.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CallHandler {
    private static final int LEVELS = 3;
    private List<Employee>[] employeeLevels = new ArrayList[LEVELS];
    //queues for each call's rank
    Queue<Call>[] callQueues = new LinkedList[LEVELS];

    public CallHandler() {/*do smth*/}

    Employee getCallHandler(Call call) {
        for (Rank level = call.getRank(); level.value() < LEVELS - 1; level = level.next()) {
            List<Employee> employeeLevel = employeeLevels[level.value()];
            for (Employee employee : employeeLevel) {
                if (employee.isFree()) {
                    return employee;
                }
            }
        }

        return null;
    }

    void dispatchCall(Call call) {
        Employee employee = getCallHandler(call);
        if (employee != null) {
            employee.receiveCall(call);
        } else {
            callQueues[call.getRank().value()].add(call);
        }
    }

    void getNextCall(Employee employee) {/*do smth*/}
}
