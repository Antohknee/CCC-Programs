public class CellPlan
{
  int userCalling;
  int userTexting;
  int userData;
  int userLongDistance;
  private int dataLimit;
  private int callingMinuteLim;
  private int textingLimit;
  private float dataCharges;
  private float callingCharges;
  private float textingCharges;
  private float baseCost;
  private float longCharges;
  // private float extraCost;
  
  //Superclass
  public CellPlan (int a, int b, int c, int d, int e, int f, int g, float h, float i, float j, float k, float l)
  {
    a = userCalling;
    b = userTexting;
    c = userData;
    d = userLongDistance:
    e = dataLimit;
    f = callingMinuteLim;
    g = textingLimit;
    h = dataCharges;
    i = callingCharges;
    j = textingCharges;
    k = baseCost;
    l = longCharges;
  }
  
  public Float checkCost()
  {
    //Calculating Calling Cost
    if (this.userCalling > this.callingMinuteLim)
    {
      float callingCost =  (this.userCalling - this.callingMinuteLim) * this.callingCharges;
    }
    
    //Calculating Data Cost
    if (this.userData > this.dataLimit)
    {
      float dataCost =  (this.userData - this.dataLimit) * this.dataCharges;
    }
    
    //Calculating Long Distance Cost
    float distanceCost = (this.userLongDistance * this.longCharges);
    
    
    //Calculating Cost for all Possibilities 
    float cost = 0;
    
    //When user is within calling limit but goes over data
    if (this.userCalling < this.callingMinuteLim) && (this.userData > this.dataLimit)
    {
      cost = baseCost + distanceCost;

      
    //When user is over calling but is not over data
    else if (this.userCalling > this.callingMinuteLim) && (this.userData < this.dataLimit)
    {
      cost = baseCost + callingCost + distanceCost;
    }
    
    //When user is not over calling and not over data
    else if (this.userCalling < this.callingMinuteLim) && (this.userData < this.dataLimit)
    {
      cost = baseCost + dataCost + distanceCost;
    }
    
    //When user is over calling and data
    else if (this.userCalling > this.callingMinuteLim) && (this.userData > this.dataLimit)
    {
      cost = baseCost + callingCost + dataCost + distanceCost;
    }
  
    return cost;
  }
     
}
  
  
public class Wind extends CellPlan
    
    