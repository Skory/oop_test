package com.siliconmint.test;

public class Call {
    private Rank rank; // minimal rank of employee who can handle this call

    public void reply(String message) {/*do smth*/}

    public void disconnect() {/*do smth*/}

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Call(Rank rank) {
        this.rank = rank;
    }
}
