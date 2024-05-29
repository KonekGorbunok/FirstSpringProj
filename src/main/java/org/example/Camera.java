package org.example;

public class Camera {
    CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public Camera(CameraRoll cameraRoll){
        this.cameraRoll = cameraRoll;
    }
    public void doPhotograph(){
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}