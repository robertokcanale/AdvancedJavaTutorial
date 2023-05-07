module AJP {
    //All packages defined here are available to ALL MY PACKAGES
    //Module is on top, everything under it are packages
    //I can also define what available OUTSIDE of my module, to other packages
    requires java.desktop;
    exports Chapter4.MethodReferences; //this is availabe OUTSIDE
}