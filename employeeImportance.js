const employees1 = [
  new Employee(1, 5, [2, 3]),
  new Employee(2, 3, []),
  new Employee(3, 3, []),
];

const employees2 = [new Employee(1, 2, [5]), new Employee(5, -3, [])];
const id1 = 1;
const id2 = 5;

function Employee(id, importance, subordinates) {
  this.id = id;
  this.importance = importance;
  this.subordinates = subordinates;
}

function GetImportance(employees, id) {
  // const index = employees.reduce((map, currEmpl))=>{
  //     map[currEmpl.id] = currEmpl;
  //     return map;
  // }, {});
  const index = {};
  for (const empl of employees) {
    index[empl.id] = empl;
  }
  const dfs = (emplId) => {
    const empl = index[emplId];
    let totalImportance = empl.importance;
    for (const subId of empl.subordinates) {
      totalImportance += dfs(subId);
    }
    return totalImportance;
  };
  return dfs(id);
}

console.log(
  `Given an employee's ID = ${id1}, the total importance value of this employee and all subordinates in array: ${JSON.stringify(
    employees1
  )} is ${GetImportance(employees1, id1)}`
);
console.log(
  `Given an employee's ID = ${id2}, the total importance value of this employee and all subordinates in array: ${JSON.stringify(
    employees2
  )} is ${GetImportance(employees2, id2)}`
);
