package epam;

class MajorityElement {
    MajorityElement() {
    }

    void printMajority(int[] a, int size) {
        int candidate = this.findCandidate(a, size);
        if (this.isMajority(a, size, candidate)) {
            System.out.println(" " + candidate + " ");
        } else {
            System.out.println("No Majority Element");
        }

    }

    int findCandidate(int[] a, int size) {
        int maj_index = 0;
        int count = 1;

        for(int i = 1; i < size; ++i) {
            if (a[maj_index] == a[i]) {
                ++count;
            } else {
                --count;
            }

            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }

        return a[maj_index];
    }

    boolean isMajority(int[] a, int size, int candidate) {
        int count = 0;

        for(int i = 0; i < size; ++i) {
            if (a[i] == candidate) {
                ++count;
            }
        }

        return count > size / 2;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] a = new int[]{3, 3, 2, 2, 3, 3};
        int size = a.length;
        majorityElement.printMajority(a, size);
    }
}