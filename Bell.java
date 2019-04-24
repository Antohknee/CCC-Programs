public class Bell extends CellPlan
{
  // Attributes
  
  boolean products;
  
  public Bell(int a, int b, int c, int d, int e, int f, int g, float h, float i, float j, float k, float l, boolean r)
  {
    super(a, b, c, d, e, f, g, h, i, j, k, l);
    this.products = r;
  }
  
  
  public Float checkCost()
  {
    //Calculating Calling Cost
    float callingCost = 0;
    if (this.userCalling > this.callingMinuteLim)
    {
      callingCost =  (this.userCalling - this.callingMinuteLim) * this.callingCharges;
    }
    
    //Calculating Data Cost
    float dataCost = 0;
    if (this.userData > this.dataLimit)
    {
       dataCost =  (this.userData - this.dataLimit) * this.dataCharges;
    }
    
    //Calculating Long Distance Cost
    float distanceCost = (this.userLongDistance * this.longCharges);
    
    
    //Calculating Cost for all Possibilities 
    float cost = 0;
    
    //When user is within calling limit but goes over data limit
    if ((this.userCalling < this.callingMinuteLim) && (this.userData > this.dataLimit))
    {
      cost = baseCost + distanceCost;
    }
      
    //When user is over calling but is not over data
    else if ((this.userCalling > this.callingMinuteLim) && (this.userData < this.dataLimit))
    {
      cost = this.baseCost + callingCost + distanceCost;
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
    
    if (this.products = true)
    {
      cost = cost - 10;
    }
  
    return cost;
  }
}