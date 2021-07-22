package xin.carryzheng.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * #54 螺旋矩阵
 *
 * @author zhengxin
 * @date 2021-04-09 23:33:53
 */
public class SpiralMatrix {
  public static void main(String[] args) {
    new SpiralMatrix()
        .spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})
        .forEach(System.out::println);
  }

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0) {
      return result;
    }

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    String direction = "right";

    while (left <= right && top <= bottom) {

      switch (direction) {
        case "right":
          for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
          }
          top++;
          direction = "down";
          break;

        case "down":
          for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
          }
          right--;
          direction = "left";
          break;

        case "left":
          for (int i = right; i >= left; i--) {
            result.add(matrix[bottom][i]);
          }
          bottom--;
          direction = "top";
          break;

        case "top":
          for (int i = bottom; i >= top; i--) {
            result.add(matrix[i][left]);
          }
          left++;
          direction = "right";
      }

      /*
                  if ("right".equals(direction)) {
                      for (int i = left; i <= right; i++) {
                          result.add(matrix[top][i]);
                      }
                      top++;
                      direction = "down";
                  } else if ("down".equals(direction)) {
                      for (int i = top; i <= bottom; i++) {
                          result.add(matrix[i][right]);
                      }
                      right--;
                      direction = "left";
                  } else if ("left".equals(direction)) {
                      for (int i = right; i >= left; i--) {
                          result.add(matrix[bottom][i]);
                      }
                      bottom--;
                      direction = "top";

                  } else if ("top".equals(direction)) {
                      for (int i = bottom; i >= top; i--) {
                          result.add(matrix[i][left]);
                      }
                      left++;
                      direction = "right";
                  }
      */
    }
    return result;
  }
}
