public class TimeFutebol {
    public static void main(String[] args) {
        String[] tecnico = {"Evaristo de Macedo"};

        String[] jogadores = new String[11];
        jogadores[0] = "Ronaldo";
        jogadores[1] = "Tarantini";
        jogadores[2] = "João Marcelo";
        jogadores[3] = "Claudir";
        jogadores[4] = "Paulo Rodrigues";
        jogadores[5] = "Paulo Robson";
        jogadores[6] = "Gil Sergipano";
        jogadores[7] = "Bobô";
        jogadores[8] = "Charles Fabian";
        jogadores[9] = "Zé Carlos";
        jogadores[10] = "Marquinhos";

        System.out.printf("Técnico: %s\n\n",tecnico[0]);
        System.out.printf("Jogadores:\n");

        for(int i=0;i<jogadores.length;i++){
            System.out.printf("%d - %s\n",i+1,jogadores[i]);
        }
    }
}
