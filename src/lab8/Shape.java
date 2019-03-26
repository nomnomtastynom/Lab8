package lab8;
public enum Shape{
   THIMBLE, BOOT, RACECAR;

//This creates a toStrng of whatever uses it
public String toString()
{
    return this.name().toLowerCase();
}

}