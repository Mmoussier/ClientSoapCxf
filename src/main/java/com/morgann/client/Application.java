package com.morgann.client;

import com.morgann.ws.HelloWorld;
import com.morgann.ws.HelloWorldImplService;
import com.morgann.ws.Job;

public class Application {
    public static void main(String[] args) {

        // Appel du Web Service SOAP du projet HelloWorldSoapWs
        // Avant d'éxécuter le client, ouvrir le projet HelloWorldSoapWs et éxécuter HelloWorldPublisher
        HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldImplService.getHelloWorldImplPort();
        System.out.println(helloWorld.getHelloWorldAsString("Paramètre envoyé par le client"));
        // doit afficher : La chaîne 'Paramètre envoyé par le client' a été recue par le Web Service Hello World

        Job job = new Job();
        job.setReference("Job reference from client");
        helloWorld.updateJob(job);
    }
}
