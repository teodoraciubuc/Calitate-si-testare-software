package strategy;

import strategy.CityRide.CalculContext;
import strategy.CityRide.TarifNoapte;
import strategy.NetflexPlayer.PlayVideoContxt;
import strategy.NetflexPlayer.VideoTelefon;
import strategy.NetflexPlayer.VideoTelevizor;
import strategy.NetflexPlayer.VideoWEB;
import strategy.s11Bancomat.BacnoteMari;
import strategy.s11Bancomat.RetragereBani;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //PENTRU NETFLEX
        PlayVideoContxt videoTelefon = new PlayVideoContxt();
        videoTelefon.setCompress(new VideoTelefon());
        videoTelefon.playVideo();

        PlayVideoContxt videoWeb = new PlayVideoContxt();
        videoWeb.setCompress(new VideoWEB());
        videoWeb.playVideo();

        PlayVideoContxt videoTelevizor = new PlayVideoContxt();
        videoTelevizor.setCompress(new VideoTelevizor());
        videoTelevizor.playVideo();

        //PENTRU RIDE
        CalculContext tarifNoapte=new CalculContext();
        tarifNoapte.setTotal(new TarifNoapte());
        tarifNoapte.calculeaza(20.0);

        //pt bancomat
        RetragereBani bacnotemari=new RetragereBani();
        bacnotemari.setIclient(new BacnoteMari());
        bacnotemari.retragere();

        //de aici incepe chain


    }
}