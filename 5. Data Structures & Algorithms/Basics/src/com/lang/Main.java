package com.lang;




public class Main {
    public static void main(String[] args) throws Exception {
        //Number doubleObj = new Number();
        //doubleObj.operations();
        //Process process = new Process();
        //process.processOperations();
        //process.memoryManagement();
        //process.executeOtherPrograms();
        //process.runtimeVersion();
        //process.buildProcesses();
        //SystemEnv systemEnv = new SystemEnv();
        //systemEnv.envCheck();
        //systemEnv.programRunningTime();
        //systemEnv.systemProperties();
        //TestClone testClone = new TestClone();
        //testClone.a=10;
        //testClone.d=100.0;
        //TestClone tc1 = testClone.cloneClass();
        //tc1.d=101.0;
        //System.out.println(testClone.a+" : "+testClone.d);
        //System.out.println(tc1.a+" : "+tc1.d);
        //TestClone tc2 = testClone.clone();
        //System.out.println(tc2.a+" : "+tc2.d);
        //Class<?> tcObj = testClone.getClass();
        //System.out.println(tcObj.getName());
        PackageTest packageTest = new PackageTest();
        packageTest.testPackages();
        packageTest.testModule();
    }
}
