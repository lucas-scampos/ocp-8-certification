package com.certification.advanced_class_design;

public class CaseOfThePrivateInterface {
    private interface Secret {
        public void shh();
    }

    class DontTell implements Secret {
        public void shh() {
        }
    }
}