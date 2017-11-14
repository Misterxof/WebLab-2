package client;

import tariff.Species;

/**
 * Class client
 */
public class Client {

    private String clientName;
    private String clientPhoneNumbers;
    private Species species;

    /**
     * Constructor of class Client
     * @param clientName - client name
     * @param clientPhoneNumbers - client phone number
     * @param species - species
     */
    public Client(String clientName, String clientPhoneNumbers, Species species){
        this.clientName=clientName;
        this.clientPhoneNumbers=clientPhoneNumbers;
        this.species = species;
    }

    /**
     * The method changes the value of the field client name
     * @param clientName - client name
     */
    public void setClientName(String clientName){
        this.clientName=clientName;
    }

    /**
     *The method returns the value of the field clientName
     * @return the value of the field clientName
     */
    public String getClientName(){
        return clientName;
    }

    /**
     * The method change the value of the field clientPhoneNumbers
     * @param clientPhoneNumbers - client phone number
     */
    public void setClientPhoneNumbers(String clientPhoneNumbers){
        this.clientPhoneNumbers=clientPhoneNumbers;
    }

    /**
     * The method returns the value of the field clientPhoneNumbers
     * @return the value of the field clientPhoneNumbers
     */
    public String getClientPhoneNumbers(){
        return clientPhoneNumbers;
    }

    /**
     * The method returns the value of the field species
     * @return the value of the field species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * The method change the value of the field species
     * @param species - species
     */
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * Overriding the method toString
     * @return string
     */
    @Override
    public String toString(){
        return "\n client Name: " + clientName + " |PhoneNumbers: " + clientPhoneNumbers + " |Tariff plan: " + species;
    }
}
