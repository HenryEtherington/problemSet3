public class Computer implements IDable {


  private String Id;
  private String make;
  protected Memory memory;


    public Computer (String make,String memType, int memSize){
        setMake(make);
        memory= new Memory(memType,memSize);

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }


    public String toString(){
        return String.format("ID: %15s\n Make: %15s\n %s", getMake(),getId(), memory.toString());
    }

    @Override
    public void setId() {

    }
}


