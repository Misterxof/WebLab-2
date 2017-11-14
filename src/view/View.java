package view;

import logic.Logic;
import search.Search;
import tariff.Tariff;

/**
 * Class View demonstrates the work of the program
 */
public class View {

    public static void main(String[] args) {

        Logic logic = new Logic();
        logic.add();

        System.out.println("\n List of Tariffs");
        for (Tariff tariffBonus : logic.list) {
            System.out.println(tariffBonus);
        }

        System.out.println("\n Search Tariff by costTariff = 100: ");
        System.out.println(Search.searchTariffForCostTariff(logic.list, 100));
        System.out.println("\n Search Tariff by costSms = 18: ");
        System.out.println(Search.searchTariffForCostSms(logic.list, 18));
        System.out.println("\n Search Tariff by packageInternet = 2048: ");
        System.out.println(Search.searchTariffForPackageInternet(logic.list, 2048));

        logic.sort();

        System.out.println("\n Number of clients = " + logic.clientsCount());

        System.out.println("\n List of Tariffs");
        for (Tariff tariffBonus : logic.list) {
            System.out.println(tariffBonus);
        }
    }
}