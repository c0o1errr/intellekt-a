package APM;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

public class Clients implements Serializable {
    private String name;
    private ContactPerson contactPerson;
    private List<Requisites> requisites;

    public Clients(String name, ContactPerson contactPerson, List<Requisites> requisites) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.requisites = requisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<Requisites> getRequisites() {
        return requisites;
    }

    public void setRequisites(List<Requisites> requisites) {
        this.requisites = requisites;
    }

    class Requisites {
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
