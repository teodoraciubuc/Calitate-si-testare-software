package chain;

import chain.concediuPrezentare.AprobareConcediuHandler;
import chain.s11bancomat.*;
import chain.s4Train.AbstractTrainRoute;
import chain.s4Train.InterCityHandler;
import chain.s4Train.InterRegioHandler;
import chain.s4Train.RegioHandler;
import chain.sistemAprobare.AprobareHandler;
import chain.sistemAprobare.DirectorHandler;
import chain.sistemAprobare.ManagerHandler;
import chain.sistemAprobare.TeamLeaderHandler;

import java.net.spi.InetAddressResolver;

public class Main {
    public static void main(String[] args) {
//        AprobareConcediuHandler teamLeader = new TeamLeaderHandler();
//        AprobareConcediuHandler manager = new ManagerHandler();
//        AprobareConcediuHandler director = new DirectorHandler();
//
//        teamLeader.setNext(manager);
//        manager.setNext(director);
//
//        teamLeader.aproba(1);
//        teamLeader.aproba(4);
//        teamLeader.aproba(8);
//        teamLeader.aproba(15);

        //aici e aprobare suma
        AprobareHandler teamLeader= new TeamLeaderHandler();
        AprobareHandler manager= new ManagerHandler();
        AprobareHandler director= new DirectorHandler();

        teamLeader.setNext(manager);
        manager.setNext(director);

        teamLeader.aprobaCerere(100);
        teamLeader.aprobaCerere(300);
        teamLeader.aprobaCerere(1500);
        teamLeader.aprobaCerere(7000);
        teamLeader.aprobaCerere(15000);

        //main
        AbstractTrainRoute regio=new RegioHandler();
        AbstractTrainRoute interRegio=new InterRegioHandler();
        AbstractTrainRoute interCity=new InterCityHandler();

        regio.setNext(interRegio);
        interRegio.setNext(interCity);

        regio.preluare(70);
        regio.preluare(400);
        regio.preluare(600);

        //s11 bancomat chain

        AbstractBancomat handler10=new Handler10();
        AbstractBancomat handler20=new Handler20();
        AbstractBancomat handler50=new Handler50();

        handler50.setNext(handler20);
        handler20.setNext(handler10);

        handler50.retragere(180);
        handler50.retragere(40);
        handler50.retragere(30);
        handler50.retragere(7);
//
//
//        try {
//            System.out.println("Retragere 180 lei:");
//            handler50.retragere(180);
//        } catch (RetragereException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println("Retragere 35 lei:");
//            handler50.retragere(35);
//        } catch (RetragereException e) {
//            System.out.println(e.getMessage());
//        }
    }
}