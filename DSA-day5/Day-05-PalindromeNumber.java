class Solution:
    def isPalindrome(self, x: int) -> bool:
        return str(x) == str(x)[::-1]

if __name__ == "__main__":
    s = Solution()
    print(s.isPalindrome(121))   # True
    print(s.isPalindrome(-121))  # False
    print(s.isPalindrome(10))    # False
