public class Weight {

   public  int stones, pounds;

        public Weight() {

            int stones = 0;
            int pounds = 0;

        }

      public Weight(int stns, int pds) {

            setStones(stns);
            setPounds(pds);
      }
    //Accessor methods

    public void setStones(int pds){
        pounds = pds;
    }

    public void setPounds(int stns){
       stones = stns;
    }

    public void setWeight(int stones, int pounds) {

            setStones(stones);
            setPounds(pounds);
    }

    //Constructor method
    @Override
    public String toString() {
        return  stones + "st"  + pounds + "pds";
      }
    }

