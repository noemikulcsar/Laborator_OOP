import java.nio.channels.ScatteringByteChannel;

public class ExceptieZiNelucratoare extends Exception
{
    public ExceptieZiNelucratoare(){}
    public ExceptieZiNelucratoare(String mesaj)
    {
        super(mesaj);
    }
}
