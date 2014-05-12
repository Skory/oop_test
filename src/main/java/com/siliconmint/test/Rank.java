package com.siliconmint.test;

public enum Rank {
    FRESHER {
        public Rank next() {
            return TL;
        }

        public int value() {
            return 0;
        }
    }, TL {
        public Rank next() {
            return PM;
        }

        public int value() {
            return 1;
        }
    }, PM {
        public Rank next() {
            return UNKNOWN;
        }

        public int value() {
            return 2;
        }
    }, UNKNOWN {
        public Rank next() {
            return UNKNOWN;
        }

        public int value() {
            return 3;
        }
    };

    public Rank next() {
        return FRESHER;
    }

    public int value() {
        return 0;
    }
}
