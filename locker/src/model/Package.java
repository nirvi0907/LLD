package locker.src.model;

public class Package {
    private int id;
    private int size;
    private PackageStatus status;

    public PackageStatus getStatus() {
        return status;
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    public Package(int id, int size) {
        this.id = id;
        this.size = size;
        this.status = PackageStatus.NOT_DELIVERED;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }
}
