package chapter12.example1;

public class Main {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,file6;
        AbstractFile folder1,folder2,folder3,folder4;
        folder1 = new Folder("唐波的资料");
        folder2 = new Folder("文本文件夹");
        folder3 = new Folder("图片文件夹");
        folder4 = new Folder("视频文件夹");

        file1 = new TextFile("九阴真经.txt");
        file2 = new TextFile("葵花宝典.txt");
        file3 = new ImageFile("杨过.jpg");
        file4 = new ImageFile("小龙女.jpg");
        file5 = new VideoFile("郭靖守襄阳.mp4");
        file6 = new VideoFile("降龙十八掌教学.mp4");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder4.add(file6);
//        folder2.killVirus();


        for (int i = 0; i < 3; i++) {
            AbstractFile child = folder1.getChild(i);
            child.killVirus();
        }

    }
}
