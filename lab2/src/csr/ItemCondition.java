package csr;

public enum ItemCondition {
    NEW{
        @Override public String toString(){
            return "New";
        }
    },
    USED{
        @Override public String toString(){
            return "Used";
        }
        },
    DAMAGED{
            @Override public String toString(){
                return "Damaged";
            }
    }
}
