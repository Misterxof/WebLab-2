package logic;

import builder.ManagerBuilder;
import client.Client;
import sort.SortBySpecies;
import tariff.Species;
import tariff.Tariff;
import tariff.TariffBonus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class Logic
 */
public class Logic {

    TariffBonus smart = ManagerBuilder.getTariffBonus(100,100,10,10,Species.SMART,1024,30);
    TariffBonus mega = ManagerBuilder.getTariffBonus(24,23,14,10,Species.MEGA,2048,360);
    TariffBonus smartMini = ManagerBuilder.getTariffBonus(30,23,16,15,Species.SMARTMINI,1024,60);
    TariffBonus absolute = ManagerBuilder.getTariffBonus(20,45,18,15,Species.ABSOLUTE,1024,100);


    Client client1 = new Client("Poll","375256781190",Species.SMART);
    Client client2 = new Client("Nick","375296857898",Species.SMARTMINI);
    Client client3 = new Client("James","375257689001",Species.ABSOLUTE);
    Client client4 = new Client("Mike","375295436756",Species.MEGA);
    Client client5 = new Client("Liza","375294234256",Species.SMART);

    public List<Tariff> list = new ArrayList<Tariff>();
    public List<Client> clientsList = new ArrayList<Client>();

    /**
     *The method add Objects to lists
     */
    public void add(){
        list.add(smart);
        list.add(mega);
        list.add(smartMini);
        list.add(absolute);

        clientsList.add(client1);
        clientsList.add(client2);
        clientsList.add(client3);
        clientsList.add(client4);
        clientsList.add(client5);
    }

    /**
     * The method returns size of clientList
     * @return size of clientList
     */
    public int clientsCount(){
        return clientsList.size();
    }

    /**
     * The method sorts list
     */
    public void sort(){
        Collections.sort(list, new SortBySpecies());
    }

}
