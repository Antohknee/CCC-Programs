public class Wind extends CellPlan
{
  // Attributes
  
  boolean PhoneOne;
  
  public Wind(int a, int b, int c, int d, int e, int f, int g, float h, float i, float j, float k, float l, boolean t)
  {
    super(a, b, c, d, e, f, g, h, i, j, k, l);
    this.PhoneOne = t;
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
    if ((this.userCalling < this.callingMinuteLim) && (this.userData > this.dataLimit))
    {
      cost = baseCost + distanceCost;
    }
      
    //When user is over calling but is not over data
    else if ((this.userCalling > this.callingMinuteLim) && (this.userData < this.dataLimit))
    {
      cost = baseCost + callingCost + distanceCost;
    }
    
    //When user is not over calling and not over data
    else if ((this.userCalling < this.callingMinuteLim) && (this.userData < this.dataLimit))
    {
      cost = baseCost + dataCost + distanceCost;
    }
    
    //When user is over calling and data
    else if ((this.userCalling > this.callingMinuteLim) && (this.userData > this.dataLimit))
    {
      cost = baseCost + callingCost + dataCost + distanceCost;
    }
    
    if (this.PhoneOne == False)
    {
      cost = cost - 5;
    }
  
    return cost;
  }
}