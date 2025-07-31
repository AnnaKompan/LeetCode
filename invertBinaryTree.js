class TreeNode {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

function arrayToTree(arr) {
  if (!arr.length) return null;
  let root = new TreeNode(arr[0]);
  let queue = [root];
  let i = 1;

  while (queue.length && i < arr.length) {
    let current = queue.shift();

    if (arr[i] != null) {
      current.left = new TreeNode(arr[i]);
      queue.push(current.left);
    }
    i++;

    if (arr[i] != null) {
      current.right = new TreeNode(arr[i]);
      queue.push(current.right);
    }
    i++;
  }

  return root;
}

function treeToArray(root) {
  if (!root) return [];
  let result = [];
  let queue = [root];

  while (queue.length) {
    let node = queue.shift();
    if (node) {
      result.push(node.val);
      queue.push(node.left);
      queue.push(node.right);
    } else {
      result.push(null);
    }
  }

  while (result[result.length - 1] === null) {
    result.pop();
  }

  return result;
}

function invertTree(root) {
  if (root == null) {
    return root;
  }
  [root.left, root.right] = [root.right, root.left];
  invertTree(root.left);
  invertTree(root.right);
  return root;
}

const root1 = arrayToTree([4, 2, 7, 1, 3, 6, 9]);
const root2 = arrayToTree([2, 1, 3]);
const root3 = arrayToTree([]);

console.log(
  `Inverted version of [4,2,7,1,3,6,9] is: ${JSON.stringify(
    treeToArray(invertTree(root1))
  )}`
);
console.log(
  `Inverted version of [2,1,3] is: ${JSON.stringify(
    treeToArray(invertTree(root2))
  )}`
);
console.log(
  `Inverted version of [] is: ${JSON.stringify(treeToArray(invertTree(root3)))}`
);
