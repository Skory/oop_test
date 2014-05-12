package com.siliconmint.test;

class Employee {
    private CallHandler callHandler;
    private Rank rank;
    private boolean free;

    public Employee(Rank rank) {this.rank = rank;}
    void receiveCall(Call call) {}
    void callHandled(Call call) {}
    void cannotHandle(Call call) {
        //escalate call
        call.setRank(rank.next());
        callHandler.dispatchCall(call);
        free = true;
        callHandler.getNextCall(this); // look for waiting call
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
