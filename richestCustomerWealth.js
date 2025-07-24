const accounts1 = [
  [1, 2, 3],
  [3, 2, 1],
];
const accounts2 = [
  [1, 5],
  [7, 3],
  [3, 5],
];
const accounts3 = [
  [2, 8, 7],
  [7, 1, 3],
  [1, 9, 5],
];

function maximumWealth(accounts) {
  richest = Math.max(...accounts.map((acc) => acc.reduce((a, b) => a + b, 0)));
  return richest;
}

console.log(
  `Maximum amount among all the customers is: ${maximumWealth(accounts1)}`
);
console.log(
  `Maximum amount among all the customers is: ${maximumWealth(accounts2)}`
);
console.log(
  `Maximum amount among all the customers is: ${maximumWealth(accounts3)}`
);
