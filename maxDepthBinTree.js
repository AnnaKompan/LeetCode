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

const root1 = arrayToTree([3, 9, 20, null, null, 15, 7]);
const root2 = arrayToTree([1, null, 2]);

function maxDepth(root) {
  if (root == null) {
    return 0;
  }
  return Math.max(maxDepth(root["left"]), maxDepth(root["right"])) + 1;
}

console.log(`Maximum depth of tree 1 is: ${maxDepth(root1)}`);
console.log(`Maximum depth of tree 2 is: ${maxDepth(root2)}`);
