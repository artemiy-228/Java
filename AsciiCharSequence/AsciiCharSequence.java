public class AsciiCharSequence implements CharSequence{
    private byte[] string;

    AsciiCharSequence(byte[] arr){
        string = new byte[arr.length];
        for(int i = 0; i < arr.length; i++){
            string[i] = arr[i];
        }
    }

    private AsciiCharSequence(AsciiCharSequence t, int start, int end){
        string = new byte[end - start];
        for(int i = 0; i < string.length; i++){
            string[i] = t.string[i + start];
        }
    }

    @Override
    public String toString(){
        StringBuilder tempStr = new StringBuilder();
        for(int i = 0; i < string.length; i++){
            tempStr.append((char)string[i]);
        }
        return tempStr.toString();
    }

    @Override
    public int length() {
        return string.length;
    }

    @Override
    public char charAt(int index) {
        return (char) string[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(this, start, end);
    }
}