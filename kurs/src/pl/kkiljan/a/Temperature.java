package pl.kkiljan.a;

public class Temperature
    {
    private double value;

    public Temperature(double value)
        {
        this.value = value;
        }


    public void ifPositive()
        {
        if (this.value > 0)
            {
            System.out.println("Temperatura jest dodatnia");

            } else
            {
            System.out.println("Temperatura jest ujemna lub r\u00f3wna zero");

            }

        }
    }
