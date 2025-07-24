// Example 1 (Output: 8)
const grid1 = [
  [4, 3, 2, -1],
  [3, 2, 1, -1],
  [1, 1, -1, -2],
  [-1, -1, -2, -3],
];

// Example 2 (Output: 0)
const grid2 = [
  [3, 2],
  [1, 0],
];

console.log(
  `There are ${countNegatives(grid1)} negative numbers in the matrix`
);
console.log(
  `There are ${countNegatives(grid2)} negative numbers in the matrix`
);

// function countNegatives(grid) {
//   let negatives = 0;
//   for (row of grid) {
//     let left = 0;
//     let right = row.length - 1;
//     while (left <= right) {
//       let mid = Math.floor(left + (right - left) / 2);
//       if (row[mid] < 0) {
//         right = mid - 1;
//       } else {
//         left = mid + 1;
//       }
//     }
//     negatives += row.length - left;
//   }
//   return negatives;
// }

function countNegatives(grid) {
  let negatives = 0;
  let rows = grid.length;
  let cols = grid[0].length;
  let row = cols - 1;
  let col = 0;

  while (row >= 0 && col < cols) {
    if (grid[row][col] < 0) {
      negatives += rows - row;
      row--;
    } else {
      col++;
    }
  }
  return negatives;
}
