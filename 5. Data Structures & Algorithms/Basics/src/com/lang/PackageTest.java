package com.lang;

public class PackageTest {
    void testPackages() {
        Package[] pkgs = Package.getPackages();
        for (Package pkg : pkgs)
            System.out.println(pkg.getImplementationTitle() + " : " + pkg.getImplementationVendor() + " : " + pkg.getImplementationVersion() + " : " + pkg.getName());
    }
    void testModule(){
        Module mod = PackageTest.class.getModule();
        System.out.println(mod);
    }
}
