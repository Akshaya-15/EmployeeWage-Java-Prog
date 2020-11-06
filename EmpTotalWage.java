 public static class EmpTotalWage {

        public String companyName = " ";
        public int empRatePerHr = 0;
        public int noOfWorkDay = 0;
        public int maxHrsInMonth = 0;

        public int totalEmpWage = 0;

        public EmpTotalWage(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth) {
            this.companyName = companyName;
            this.empRatePerHr = empRatePerHr;
            this.noOfWorkDay = noOfWorkDay;
            this.maxHrsInMonth = maxHrsInMonth;
        }

        //GETTERS method to get variables
        public String getCompanyName() {
            return companyName;
        }

        public int getEmpRatePerHour() {
            return empRatePerHr;
        }

        public int getNumOfWorkingDays() {
            return noOfWorkDay;
        }

        public int getMaxHrsInMonth() {
            return maxHrsInMonth;
        }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        public int getTotalEmpWage() {
            return totalEmpWage;
        }
    }

