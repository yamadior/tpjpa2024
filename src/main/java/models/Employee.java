package models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
        private Long id;

        private String name;

        private models.Department department;

        public Employee() {
        }

        public Employee(String name, models.Department department) {
            this.name = name;
            this.department = department;
        }

        public Employee(String name) {
            this.name = name;
        }

        @Id
        @GeneratedValue
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @ManyToOne
        public models.Department getDepartment() {
            return department;
        }

        public void setDepartment(models.Department department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", department="
                    + department.getName() + "]";
        }

    }


