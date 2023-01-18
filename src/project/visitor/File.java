package project.visitor;

public class File {
    private String name;
    private String size;
    private String lastAccessedTime;
    private String lastModifiedTime;
    private String permissions;
    private String owner;

    public File(String name, String size, String lastAccessedTime, String lastModifiedTime, String permissions, String owner) {
        this.name = name;
        this.size = size;
        this.lastAccessedTime = lastAccessedTime;
        this.lastModifiedTime = lastModifiedTime;
        this.permissions = permissions;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLastAccessedTime() {
        return lastAccessedTime;
    }

    public void setLastAccessedTime(String lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
