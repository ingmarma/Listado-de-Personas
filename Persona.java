public class Persona {
    private int id;
    private String name;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Constructor vacio
    public Persona (){
        this.id = ++Persona.numeroPersonas;
    }

    // Constructor con argumentos
    public Persona(String name, String tel, String email){
        this(); // se llama al constructor vacio
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 =  new Persona("Nelson Martinez", "982568672", "nelsonmartinez1@gmail.com");
        System.out.println(persona1);

    }
}
