class UndergroundSystem {
          HashMap<Integer,String[]> map;
              HashMap<String,double[]> mapAvarage;

    public UndergroundSystem() {
       map=new HashMap<>();
               mapAvarage=new HashMap<>();

    }
    
    public void checkIn(int id, String stationName, int t) {
        String[] arr={stationName,Integer.toString(t)};
        map.put(id,arr);
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        int totalTime=t-Integer.valueOf(map.get(id)[1]);
   String key=map.get(id)[0]+2+stationName;

        if(mapAvarage.containsKey(key)){
         double totalAvarage=(mapAvarage.get(key)[0]+totalTime);
         double[] dArr={totalAvarage,Double.valueOf(mapAvarage.get(key)[1]+1)};
      mapAvarage.put(key,dArr);

        }else{
                     double[] dArr={Double.valueOf(totalTime),1};

               mapAvarage.put(key,dArr);
   
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+2+endStation;
        return mapAvarage.get(key)[0]/mapAvarage.get(key)[1];
        
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */