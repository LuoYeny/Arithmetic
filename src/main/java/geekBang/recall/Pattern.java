package geekBang.recall;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 16:15
 */
//正则表达式的匹配（简单）
//假设正则表达式中只包含“*”和“?”这两种通配符，并且对这两个通配符的语义稍微做些改变，
// 其中，“*”匹配任意多个（大于等于 0 个）任意字符，“?”匹配零个或者一个任意字符。
public class Pattern {
    private boolean matched = false;
    private char[] pattern; // 正则表达式
    private int plen; // 正则表达式长度

    public Pattern(char[] pattern, int plen) {
        this.pattern = pattern;
        this.plen = plen;
    }

    public boolean match(char[] text, int tlen) { // 文本串及长度
        matched = false;
        rmatch(0, 0, text, tlen);
        return matched;
    }

    /**
     *
     * @param ti 文本开始
     * @param pj  正则表达式开始
     * @param text 文本
     * @param tlen  文本长度
     */
    private void rmatch(int ti, int pj, char[] text, int tlen) {
        if (matched) return;
        if(pj==plen){
            if(ti==tlen)
                matched=true;
            return;
        }

        if(pattern[pj]=='*'){//匹配任意个
            for (int i = 0; i <=tlen-ti ; i++) {
                rmatch(ti+i ,  pj+1,  text,  tlen);
            }

        }else if(pattern[pj]=='?'){//匹配一个或不匹配
            rmatch(ti+1,  pj+1,  text,  tlen);
            rmatch(ti,  pj++,  text,  tlen);

        } else if(pattern[pj]==text[ti]&&ti<tlen){
            rmatch(ti+1,  pj+1,  text,  tlen);

        }
    }
}
