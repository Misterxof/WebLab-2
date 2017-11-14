package search;

import tariff.Species;
import tariff.Tariff;
import tariff.TariffBonus;

import java.util.List;

/**
 * Class Search
 */
public class Search {

    /**
     * The method returns object of class tariffBonus by value of the field costMinuteInNet
     * @param tariff - list of Tariff
     * @param costMinuteInNet - cost minute in the Ethernet
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForCostMinuteInNet(List<Tariff> tariff, int costMinuteInNet) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getCostMinuteInNet() == costMinuteInNet) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field costTariff
     * @param tariff - list of Tariff
     * @param costTariff - cost of the Tariff
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForCostTariff(List<Tariff> tariff, int costTariff) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getCostTariff() == costTariff) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field costSms
     * @param tariff - list of Tariff
     * @param costSms - cost of the sms
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForCostSms(List<Tariff> tariff, int costSms) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getCostSms() == costSms) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field costMegabyte
     * @param tariff - list of Tariff
     * @param costMegabyte - cost of the megabyte
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForCostMegabyte(List<Tariff> tariff, int costMegabyte) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getCostMegabyte() == costMegabyte) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field packageInternet
     * @param tariff - list of Tariff
     * @param packageInternet - megabytes in package Internet
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForPackageInternet(List<Tariff> tariff, int packageInternet) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getPackageInternet() == packageInternet) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field packageMinute
     * @param tariff - list of Tariff
     * @param packageMinute - minutes in package Minute
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForPackageMinute(List<Tariff> tariff, int packageMinute) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getPackageMinute() == packageMinute) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

    /**
     * The method returns object of class tariffBonus by value of the field species
     * @param tariff - list of Tariff
     * @param species - species
     * @return object of class tariffBonus
     */
    public static Tariff searchTariffForSpecies(List<Tariff> tariff, Species species) {

        TariffBonus tariffBonus = null;

        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getSpecies() == species) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }
}