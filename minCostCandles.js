const cost1 = [1, 2, 3];
const cost2 = [6, 5, 7, 9, 2, 2];
const cost3 = [5, 5];

function minimumCost(cost) {
  cost.sort((a, b) => b - a);
  result = 0;
  for (let i = 0; i < cost.length; i++) {
    if ((i + 1) % 3 !== 0) {
      result += cost[i];
    }
  }
  return result;
}

console.log(
  `The total cost of buying all candies ${cost1} is ${minimumCost(cost1)}`
);
console.log(
  `The total cost of buying all candies ${cost2} is ${minimumCost(cost2)}`
);
console.log(
  `The total cost of buying all candies ${cost3} is ${minimumCost(cost3)}`
);
