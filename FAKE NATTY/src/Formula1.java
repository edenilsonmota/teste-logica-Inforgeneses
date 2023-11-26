import java.util.ArrayList;
import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ler o número de Grandes Prêmios (numGrandesPremios) e o número de pilotos (numPilotos)
            int numGrandesPremios = scanner.nextInt();
            int numPilotos = scanner.nextInt();

            // Verificar se é o final do programa
            if (numGrandesPremios == 0 && numPilotos == 0) {
                break; // Termina o programa se numGrandesPremios e numPilotos forem ambos zero
            }

            // Criar matriz para armazenar resultados de corridas
            int[][] resultadosCorridas = new int[numGrandesPremios][numPilotos];

            // Preencher a matriz com os resultados de cada corrida
            for (int i = 0; i < numGrandesPremios; i++) {
                for (int j = 0; j < numPilotos; j++) {
                    resultadosCorridas[i][j] = scanner.nextInt();
                }
            }

            // Ler o número de sistemas de pontuação
            int numSistemasPontuacao = scanner.nextInt();

            while (numSistemasPontuacao-- > 0) {
                // Usar ArrayList para armazenar os pontos de cada posição
                ArrayList<Integer> pontosPosicao = new ArrayList<>();

                // Ler o número de posições que recebem pontos
                int numPosicoesPontuadas = scanner.nextInt();

                // Preencher o ArrayList com os pontos para cada posição
                for (int i = 0; i < numPosicoesPontuadas; i++) {
                    pontosPosicao.add(scanner.nextInt());
                }

                // Array para armazenar os pontos acumulados de cada piloto
                int[] pontosAcumulados = new int[numPilotos];

                // Calcular os pontos acumulados para cada piloto em cada corrida
                for (int i = 0; i < numGrandesPremios; i++) {
                    for (int j = 0; j < numPilotos; j++) {
                        pontosAcumulados[j] += (resultadosCorridas[i][j] <= numPosicoesPontuadas) ? pontosPosicao.get(resultadosCorridas[i][j] - 1) : 0;
                    }
                }

                // Encontrar o maior número de pontos
                int maiorPontuacao = 0;
                boolean flag = true;

                for (int i = 0; i < numPilotos; i++) {
                    if (pontosAcumulados[i] > maiorPontuacao) {
                        maiorPontuacao = pontosAcumulados[i];
                    }
                }

                // Imprimir os pilotos que têm o maior número de pontos
                for (int i = 0; i < numPilotos; i++) {
                    if (pontosAcumulados[i] == maiorPontuacao) {
                        if (flag) {
                            System.out.print(i + 1);
                            flag = false;
                        } else {
                            System.out.print(" " + (i + 1));
                        }
                    }
                }

                System.out.println();
            }
        }

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }
}
