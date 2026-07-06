<h2><a href="https://www.geeksforgeeks.org/problems/java-exception-handling-1606978567/1?page=4&category=Java&sortBy=submissions">Java Exception Handling</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given two integers a and b, return the minimum value obtained from performing any of the following arithmetic operations between <code>a</code> and <code>b</code>: addition (<code>+</code>), subtraction (-), multiplication (*), and floor division ( / ).</span><br><span style="font-size: 14pt;">Make sure to use <strong>exception handling</strong> to manage any potential division by zero errors.</span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong>If division by zero is attempted, handle the exception and exclude the division operation from consideration.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a = 5, b = -5</span>
<span style="font-size: 18px;"><strong>Output: </strong>-25</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>5+(-5) = 0, 5-(-5) = 10, 5*(-5) = -25, 5/(-5) = -1</span>
<span style="font-size: 18px;">Minimum of all is 5*(-5) = -25.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a = 5, b = 0</span>
<span style="font-size: 18px;"><strong>Output: </strong>0</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>5+0 = 5, 5-0 = 5, 5*0 = 0, 5/0 = "Exception Handling"</span>
<span style="font-size: 18px;">Minimum of all is 5*0 = 0.</span></pre>
<p><strong><span style="font-size: 18px;">Constraints:<br></span></strong><span style="font-size: 18px;">-10<sup>3</sup>&nbsp;<span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span>&nbsp;&nbsp;a, b <span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span> 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;