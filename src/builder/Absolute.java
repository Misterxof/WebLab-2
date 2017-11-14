package builder;

import tariff.Species;
import tariff.TariffBonus;

/**
 * Class Absolute
 */
public class Absolute implements Builder {

    /**
     * The method returns object of class tariffBonus with species ABSOLUTE
     * @param costTariff - cost of the tariff
     * @param costMinuteInNet - cost of minutes in the Ethernet
     * @param costSms - cost of the sms
     * @param costMegabyte - cost of megabyte
     * @param packageInternet - megabytes in package Internet
     * @param packageMinute - minutes in package Minute
     * @return tariffBonus object
     */
    public TariffBonus getTariffBonus(int costTariff, int costMinuteInNet, int costSms,int costMegabyte, int packageInternet, int packageMinute) {
        TariffBonus tariffBonus = new TariffBonus(costTariff,costMinuteInNet,costSms,costMegabyte,Species.ABSOLUTE,packageInternet,packageMinute);
        return tariffBonus;
    }
}