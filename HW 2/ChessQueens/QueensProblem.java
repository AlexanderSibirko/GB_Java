package ChessQueens;

import java.util.Arrays;

/**
 * Find solution to place 8 queens on Chess Table
 */
public class QueensProblem {
  public static void main(String[] args) {
  }

  /*
   * общие переменные, занятости общий размер поля,
   * занимаемые Ферзями колонки (так как выставляем построчно),
   * занятые колонки,
   * занятые диагоняли прямые,
   * зарятые диагоняли обратные,
   * номер решения
   */
  private int size;
  private int[] queensPositions;
  private Boolean[] occupiedCols;
  private Boolean[] occupiedDi1;
  private Boolean[] occupiedDi2;
  private int count = 0;
  private int steps;

  // создание класса и формирование базовых перменных
  public QueensProblem(int N) {
    this.size = N;
    this.queensPositions = new int[this.size];
    this.occupiedCols = new Boolean[this.size];
    this.occupiedDi1 = new Boolean[2 * this.size - 1];
    this.occupiedDi2 = new Boolean[2 * this.size - 1];
    Arrays.fill(queensPositions, 0);
    Arrays.fill(occupiedCols, false);
    Arrays.fill(occupiedDi1, false);
    Arrays.fill(occupiedDi2, false);
  }

  // устанавливаем занято/освобождено
  private void setOccupation(int rowIdx, int colIdx, Boolean status) {
    this.occupiedCols[colIdx] = status;
    this.occupiedDi1[rowIdx + colIdx] = status;
    this.occupiedDi2[rowIdx - colIdx + size - 1] = status;
  }

  // печатаем найденое решение
  private void printSolution() {
    System.out.println("Найдено " + count + " решение (на " + steps + " шаге):");
    System.out.println("_".repeat(size*4+1));
    for (int i = 0; i < size; i++) {
      StringBuilder solutionLine = new StringBuilder();
      for (int j = 0; j < size; j++) {
        solutionLine.append("|");
        if (j == queensPositions[i]) {
          solutionLine.append(" @ ");
        } else {
          solutionLine.append("   ");
        }
      }
      solutionLine.append("|");
      System.out.println(solutionLine.toString());  
      System.out.println("-".repeat(size*4+1));
    }
  }

  // проверяем занятость
  private Boolean isOccupied(int row, int col) {
    if (this.occupiedCols[col] || this.occupiedDi1[row + col] || this.occupiedDi2[row - col + size - 1]) {
      return true;
    }
    return false;
  }

  // ставим Ферзей, методом поиска с возвратом
  private void placing(int row, int limit) {
    for (int col = 0; col < size; col++) {
      steps += 1;
      if (!this.isOccupied(row, col)) {
        this.queensPositions[row] = col;
        this.setOccupation(row, col, true);

        if (row < size - 1) {
          placing(row + 1, limit);
        } else {
          if (limit > 0 && count > limit - 1) {
            return;
          } // останавливаемся при нахождении предельного кол-ва решений, если убрать будет
            // искать все рещения
          count++;
          this.printSolution();

        }
        this.setOccupation(row, col, false);
      }
    }
  }

  // запус поиска решения
  public void findSolution(int limit) {
    this.placing(0, limit);
  }

}