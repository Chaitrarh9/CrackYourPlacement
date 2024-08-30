private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> arr, boolean[] used) {
        if (tempList.size() == arr.size()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                    continue; // Skip duplicates
                }
                used[i] = true;
                tempList.add(arr.get(i));
                backtrack(result, tempList, arr, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }