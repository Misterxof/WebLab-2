package builder;

import tariff.Species;
import tariff.TariffBonus;

/**
 * Class Mega
 */
public class Mega implements Builder {

    /**
     * The method returns object of class tariffBonus with species MEGA
     * @param costTariff - cost of the tariff
     * @param costMinuteInNet - cost of minutes in the Ethernet
     * @param costSms - cost of the sms
     * @param costMegabyte - cost of megabyte
     * @param packageInternet - megabytes in package Internet
     * @param packageMinute - minutes in package Minute
     * @return tariffBonus object
     */
    public TariffBonus getTariffBonus(int costTariff, int costMinuteInNet, int costSms, int costMegabyte, int packageInternet, int packageMinute) {
        TariffBonus tariffBonus = new TariffBonus(costTariff,costMinuteInNet,costSms,costMegabyte,Species.MEGA,packageInternet,packageInternet);
        return tariffBonus;
    }
}