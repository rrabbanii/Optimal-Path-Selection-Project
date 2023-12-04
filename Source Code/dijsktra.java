import java.util.Stack;

public class dijsktra {
  int N;
  int[][] Matrix;
  int[][] timeMatrix;
  String[] Station = {"Lok Ma Chau", "Lo Wu", "Sheung Shui", "Fanling", "Tai Wo", "Tai Po Market", "University", "City One", "Shek Mun", "Tai Shui Hang", "Heng On", "Ma On Shan", "Wu Kai Sha", "Fo Tan", "Racecourse", "Sha Tin Wai", "Sha Tin", "Che Kung Temple", "Tin Shui Wai", "Long Ping", "Yuen Long", "Kam Sheung Road", "Tsuen Wan West", "Tai Wai", "Hin Keng", "Tsuen Wan", "Tai Wo Hau", "Kwai Hing", "Kwai Fong", "Lai King", "Mei Foo", "Lai Chi Kok", "Cheung Sha Wan", "Sham Shui Po", "Shek Kip Mei", "Kowloon Tong", "Lok Fu", "Wong Tai Sin", "Diamond Hill", "Choi Hung", "Kowloon Bay", "Tsing Yi", "AsiaWorld-Expo", "Sunny Bay", "Airport", "Disneyland Resort", "Tung Chung", "Nam Cheong", "Olympic", "Kowloon", "Prince Edward", "Mong Kok", "Yau Ma Tei", "Jordan", "Tsim Sha Tsui", "Austin", "Mong Kok East", "Kai Tak", "Sung Wong Toi", "To Kwa Wan", "Ho Man Tin", "Ngau Tau Kok", "Kwun Tong", "Lam Tin", "Po Lam", "Hang Hau", "Yau Tong", "Tiu Keng Leng", "Tseung Kwan O", "LOHAS Park", "Whampoa", "Hung Hom", "East Tsim Sha Tsui", "Hong Kong", "Kennedy Town", "HKU", "Sai Ying Pun", "Sheung Wan", "Central", "Admiralty", "Wan Chai", "Causeway Bay", "Tin Hau", "Fortress Hill", "North Point", "Quarry Bay", "Tai Koo", "Sai Wan Hoo", "Ocean Park", "South Horizons", "Lei Tung", "Wong Chuk Hang", "Shau Kei Wan", "Hang Fa Chuen", "Chai Wan", "Exhibition Centre", "Siu Hong", "Tuen Mun"};

  public dijsktra(int N) {
    this.N = N;
    Matrix = new int[N][N];
    timeMatrix = new int[N][N];
    addEdge(0, 2, 6, 7);
    addEdge(1, 2, 3, 5);
    addEdge(2, 3, 3, 5);
    addEdge(3, 4, 3, 5);
    addEdge(4, 5, 3, 5);
    addEdge(5, 6, 3, 4);
    addEdge(6, 13, 7, 9);
    addEdge(6, 14, 9, 11);
    addEdge(7, 8, 4, 6);
    addEdge(7, 15, 7, 9);
    addEdge(8, 9, 4, 6);
    addEdge(9, 10, 4, 6);
    addEdge(10, 11, 4, 6);
    addEdge(11, 12, 4, 6);
    addEdge(13, 16, 3, 5);
    addEdge(14, 16, 4, 6);
    addEdge(15, 17, 4, 6);
    addEdge(16, 23, 3, 5);
    addEdge(17, 23, 7, 9);
    addEdge(18, 19, 1, 3);
    addEdge(18, 96, 5, 7);
    addEdge(19, 20, 1, 3);
    addEdge(20, 21, 2, 4);
    addEdge(21, 22, 3, 5);
    addEdge(22, 30, 10, 12);
    addEdge(23, 24, 11, 13);
    addEdge(23, 35, 4, 6);
    addEdge(24, 38, 5, 7);
    addEdge(25, 26, 6, 8);
    addEdge(26, 27, 7, 9);
    addEdge(27, 28, 8, 10);
    addEdge(28, 29, 9, 11);
    addEdge(29, 30, 5, 7);
    addEdge(29, 41, 7, 9);
    addEdge(29, 47, 8, 10);
    addEdge(30, 31, 5, 7);
    addEdge(30, 47, 4, 6);
    addEdge(31, 32, 4, 6);
    addEdge(32, 33, 4, 6);
    addEdge(33, 50, 5, 7);
    addEdge(34, 35, 6, 8);
    addEdge(34, 50, 5, 7);
    addEdge(35, 36, 3, 5);
    addEdge(35, 56, 5, 7);
    addEdge(36, 37, 4, 6);
    addEdge(37, 38, 7, 9);
    addEdge(38, 39, 3, 5);
    addEdge(38, 57, 4, 6);
    addEdge(39, 40, 3, 5);
    addEdge(40, 61, 3, 5);
    addEdge(41, 43, 5, 7);
    addEdge(41, 44, 7, 9);
    addEdge(41, 49, 8, 10);
    addEdge(42, 44, 4, 6);
    addEdge(43, 45, 7, 9);
    addEdge(43, 46, 6, 8);
    addEdge(47, 48, 5, 7);
    addEdge(47, 55, 10, 12);
    addEdge(48, 49, 4, 6);
    addEdge(49, 73, 7, 9);
    addEdge(50, 51, 3, 5);
    addEdge(51, 52, 3, 5);
    addEdge(52, 53, 3, 5);
    addEdge(52, 60, 8, 10);
    addEdge(53, 54, 3, 5);
    addEdge(54, 79, 7, 9);
    addEdge(55, 72, 8, 10);
    addEdge(56, 71, 10, 11);
    addEdge(57, 58, 4, 6);
    addEdge(58, 59, 3, 5);
    addEdge(59, 60, 5, 7);
    addEdge(60, 70, 4, 6);
    addEdge(60, 71, 4, 6);
    addEdge(61, 62, 3, 5);
    addEdge(62, 63, 3, 5);
    addEdge(63, 66, 3, 5);
    addEdge(64, 65, 4, 6);
    addEdge(65, 68, 5, 7);
    addEdge(66, 67, 3, 5);
    addEdge(66, 85, 9, 11);
    addEdge(67, 68, 4, 6);
    addEdge(68, 69, 5, 7);
    addEdge(71, 72, 4, 6);
    addEdge(71, 95, 5, 7);
    addEdge(74, 75, 4, 6);
    addEdge(75, 76, 4, 6);
    addEdge(76, 77, 4, 6);
    addEdge(77, 78, 4, 6);
    addEdge(78, 79, 4, 6);
    addEdge(79, 80, 5, 7);
    addEdge(79, 88, 7, 9);
    addEdge(79, 95, 5, 7);
    addEdge(80, 81, 4, 6);
    addEdge(81, 82, 4, 6);
    addEdge(82, 83, 4, 6);
    addEdge(83, 84, 4, 6);
    addEdge(84, 85, 4, 6);
    addEdge(85, 86, 4, 6);
    addEdge(86, 87, 4, 6);
    addEdge(87, 92, 5, 7);
    addEdge(88, 91, 7, 9);
    addEdge(89, 90, 5, 7);
    addEdge(90, 91, 5, 7);
    addEdge(92, 93, 4, 6);
    addEdge(93, 94, 4, 6);
    addEdge(96, 97, 4, 6);
  }

  public void addEdge(int from, int to, int len, int time) {
    Matrix[from][to] = len;
    Matrix[to][from] = len;
    timeMatrix[from][to] = time;
    timeMatrix[to][from] = time;
  }

  public void dijsktraAlg(int src, int dst) {
    int[][] distance = new int[N][2];
    int[][] time = new int[N][2];
    boolean[] fixed = new boolean[N];
    Stack<Integer> stack = new Stack<Integer>();

    for (int i = 0; i < N; i++) {
      distance[i][0] = Integer.MAX_VALUE;
      distance[i][1] = -1;
      fixed[i] = false;
    }
    distance[src][0] = 0;

    while (true) {
      int marked = minIndex(distance, fixed);
      if (marked < 0)
        break;
      if (distance[marked][0] == Integer.MAX_VALUE)
        break;
      fixed[marked] = true;
      for (int j = 0; j < N; j++) {
        if (Matrix[marked][j] > 0 && !fixed[j]) {
          int newDistance = distance[marked][0] + Matrix[marked][j];
          int newTime = time[marked][0] + timeMatrix[marked][j];
          if (newDistance < distance[j][0]) {
            distance[j][0] = newDistance;
            distance[j][1] = marked;
            time[j][0] = newTime;
            time[j][1] = marked;
          }
        }
      }
    }
    int idx = dst;
    int parent = distance[dst][1];
    while (distance[idx][1] != -1) {
      stack.push(distance[idx][1]);
      idx = distance[idx][1];
    }
    
    while (!stack.empty())
      System.out.print(Station[stack.pop()] + " > ");
    
    if (distance[dst][0] == Integer.MAX_VALUE) {
      System.out.printf("%84s","No other routes found.\n");
    } else {
      Matrix[parent][dst] = 0;
      Matrix[dst][parent] = 0;
      System.out.println(Station[dst]);
      System.out.printf("\n%90s\n\n","ROUTE LENGTH : " + distance[dst][0] + " | TIME = " + time[dst][0] + " minutes");
      System.out.printf("\n\n%82s\n\n","[ ALTERNATIVE PATH ]");
      dijsktraAlg(src, dst);
    }
  }

  public int minIndex(int[][] distance, boolean[] fixed) {
    int idx = 0;
    for (; idx < fixed.length; idx++) {
      if (!fixed[idx])
        break;
    }
    if (idx == fixed.length)
      return -1;
    for (int i = idx + 1; i < fixed.length; i++) {
      if (!fixed[i] && distance[i][0] < distance[idx][0])
        idx = i;
    }
    return idx;
  }
}